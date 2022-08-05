import { Injectable } from '@angular/core';
import Web3 from 'web3';

@Injectable({
  providedIn: 'root'
})
export class SmartContractService {

  constructor() {
  }

  private web3: Web3;
  ganacheAddresses: string[] = []

  rawTx = {
    nonce: '0x00',
    gasPrice: '20000000000',
    gasLimit: '6721975',
    to: '0xa22153431429b06586b8C844338930bf4861C095',
    value: '50',
    data: '0x7f7465737432000000000000000000000000000000000000000000000000000000600057'
  }

  signedSmartContract() {
    var Tx = require('ethereumjs-tx').Transaction;
    var privateKey = Buffer.from('099701ef2d45a0b137459e4f0ad8c2bbbc26857ed2bbd249b034622556394d18', 'hex');

    var tx = new Tx(this.rawTx, { 'chain': 'ropsten' });
    Tx.sign(privateKey);
    var serializedTx = tx.serialize();
    this.web3.eth.sendSignedTransaction('0x' + serializedTx.toString('hex'))
      .on('receipt', console.log);
  }

  smartContract(){
    //Connection with Ganache
    this.web3 = new Web3("http://127.0.0.1:7545")

    const accountsTemp = this.web3.eth.getAccounts()
    accountsTemp.then(addresses => {
      this.doContract(addresses)
    })
  }

  doContract(addresses: string[]) {
    console.log(addresses)
    this.web3.eth.accounts.signTransaction({
      from: addresses[0],
      to: "0xa22153431429b06586b8C844338930bf4861C095",
      value: "50",
      gas: 200000,
      nonce: 3123
    }, "099701ef2d45a0b137459e4f0ad8c2bbbc26857ed2bbd249b034622556394d18").then(console.log)

    this.web3.eth.sendTransaction({
      from: addresses[0],
      to: '0xa22153431429b06586b8C844338930bf4861C095',
      value: this.web3.utils.toWei('0.1', 'ether')
    }).then(function (receipt) {
      console.log(receipt)
    });
    console.log("Obj wallets for account: " , this.web3.eth.accounts.wallet)
  }

}

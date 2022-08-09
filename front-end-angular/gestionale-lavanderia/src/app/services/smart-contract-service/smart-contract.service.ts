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
  ethereumOfClient: string = ""

  convertAllMoney(money: number) {
    //Connection to Ganache
    this.web3 = new Web3("http://127.0.0.1:7545")

    //Il 10% dei guadagni del cliente vengono guadagnati come ethereum
    let moneyDividedBy10: number = money / 10
    let moneyToEth: number = moneyDividedBy10 / 1619
    this.ethereumOfClient = parseFloat(moneyToEth.toString()).toFixed(6)
    console.log("Ethereum to send: ", this.ethereumOfClient)
    console.log("Ethereum to send in wei: ", this.web3.utils.toWei(this.ethereumOfClient, 'ether'))
    this.findAccounts()
  }

  findAccounts() {
    const accountsTemp = this.web3.eth.getAccounts()
    accountsTemp.then(addresses => {
      this.sendEther(addresses)
    })
  }

  async sendEther(addresses: string[]) {
    //Connection with Ganache
      const myContract = require('C:/Users/User/Desktop/Repository GitHub/gestionaleLavanderia/front-end-angular/gestionale-lavanderia/src/solidity-smart-contract/build/contracts/Sender.json');
      const id = await this.web3.eth.net.getId()
      const deployedNetwork = myContract.networks[id];
      const contract = new this.web3.eth.Contract(
        myContract.abi,
        deployedNetwork.address
      )
      console.log(contract)
      //10^18 wei = 1 eth
      await contract.methods.sendEther(addresses[0]).send({
        from: addresses[1],
        value: this.web3.utils.toWei(this.ethereumOfClient, 'ether'), //msg.value
        gas: 70000,
      }).on("receipt", function(receipt){
        console.log(receipt)
       });
    }


    // contract.methods.somFunc().send({from: ....})
    // .on('receipt', function(){
    //     ...
    // });
  //   console.log(addresses)
  //   this.web3.eth.accounts.signTransaction({
  //     from: addresses[0],
  //     to: addresses[1],
  //     value: "50",
  //     gas: 200000,
  //     nonce: 3123
  //   }, "099701ef2d45a0b137459e4f0ad8c2bbbc26857ed2bbd249b034622556394d18").then(console.log)

  //   this.web3.eth.sendTransaction({
  //     from: addresses[0],
  //     to: addresses[1],
  //     value: this.web3.utils.toWei(this.ethereumOfClient, 'ether')
  //   }).then(function (receipt) {
  //     console.log(receipt)
  //   });
  //   console.log("Obj wallets for account: ", this.web3.eth.accounts.wallet)
  }
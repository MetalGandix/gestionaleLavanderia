import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Web3 from 'web3';

@Injectable({
  providedIn: 'root'
})
export class SmartContractService {

  constructor(private http: HttpClient) {
  }

  clientCryptoAddress: string;
  
  //Connection to Ganache
  private web3: Web3 = new Web3("http://127.0.0.1:7545");
  ganacheAddresses: string[] = []
  ethereumOfClient: string;
  exchangeRate: number
  eur = 0;

  getExchangeRate() {
    const url = 'https://api.coingecko.com/api/v3/simple/price';
    const options = {
    params: {
    ids: 'ethereum',
    vs_currencies: 'eur'
    }
    };
    return this.http.get(url, options);
    }


  convertAllMoney(money: number) {
    //Il 10% dei guadagni del cliente vengono guadagnati come ethereum
    this.getExchangeRate().subscribe(data => {
      debugger
      let moneyDividedBy10: number = money / 10
      const exchangeRate = data['ethereum']['eur'];
      this.ethereumOfClient = (moneyDividedBy10 / exchangeRate).toFixed(5);
    console.log("Ethereum to send: ", this.ethereumOfClient)
    console.log("Ethereum to send in wei: ", this.web3.utils.toWei(this.ethereumOfClient, 'ether'))
  }).add(() => {
    this.findAccounts()
  });
    
  }

  findAccounts() {
    const accountsTemp = this.web3.eth.getAccounts()
    accountsTemp.then(addresses => {
      this.sendEtherUsingSmartContract(addresses)
    })
  }

  async sendEtherUsingSmartContract(addresses: string[]) {
    let laundryAddress = addresses[0]
    
    //Finding the contract using an absolute path
    const myContract = require('C:/Users/User/Desktop/Repository GitHub/gestionaleLavanderia/front-end-angular/gestionale-lavanderia/src/solidity-smart-contract/build/contracts/Sender.json');

    //Finding the id of the blockchain network
    const id = await this.web3.eth.net.getId()
    const deployedNetwork = myContract.networks[id];

    //Instantiating the contract
    const contract = new this.web3.eth.Contract(
      myContract.abi,
      deployedNetwork.address
    )
    console.log(contract)

    //Using the method inside the solidity file called "Sender.sol" to send ethereum between 2 addresses
    //10^18 wei = 1 eth
    await contract.methods.sendEther(this.clientCryptoAddress).send({
      from: laundryAddress,
      value: this.web3.utils.toWei(this.ethereumOfClient, 'ether'), //msg.value
      gas: 70000,
    }).on("receipt", function (receipt) {
      console.log(receipt)
    });
  }

  sendEtherDirectly() {
    //Connection to Ganache
    this.web3 = new Web3("http://127.0.0.1:7545")
    const accountsTemp = this.web3.eth.getAccounts()
    accountsTemp.then(addresses => {
      console.log(addresses)
      this.web3.eth.sendTransaction({
        from: addresses[0],
        to: addresses[1],
        value: this.web3.utils.toWei("1", 'ether')
      }).then(function (receipt) {
        console.log(receipt)
      });
    })
  }

}
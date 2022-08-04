import { Injectable } from '@angular/core';
import Web3 from 'web3';

@Injectable({
  providedIn: 'root'
})
export class SmartContractService {

  constructor() { }

  private web3: Web3;

  smartContract(){
    this.web3 = new Web3("http://127.9.9.1:7545")
    const accountsTemp = this.web3.eth.getAccounts()
    console.log("Account temp: " + accountsTemp)
    console.log("Create account: " + (this.web3.eth.accounts.create()).address)
    console.log("Sign Contracts: ")
    this.web3.eth.accounts.signTransaction({
      to: "xxx",
      value: "50",
      gas: 200000
    }, "3c09936ab3f13276f043e30236656ee4a3a4d8e46bb0a87cca1a65f56237dca1").then(console.log)
    console.log("Hash message: " + this.web3.eth.accounts.hashMessage("Yoooooo"))
    console.log("Obj wallets for account: " + this.web3.eth.accounts.wallet)
  }
  
}

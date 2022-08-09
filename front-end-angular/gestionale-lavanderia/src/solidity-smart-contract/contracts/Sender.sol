// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract Sender {
    mapping (address => uint) balance; //Mappa che contiene gli indirizzi che hanno depositato soldi su questo contratto

    event EthSentToContract(address receiver, uint amount);

    function sendEther(address payable receiver) payable public {
        receiver.transfer(msg.value);
        balance[receiver] += msg.value;
        emit EthSentToContract(receiver, msg.value);
    }
    

}
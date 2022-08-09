// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract Sender {
    mapping (address => uint) balance; //Mappa che contiene gli indirizzi che hanno depositato soldi su questo contratto

    event EthSentToContract(address receiver, uint amount);
    event ReceiverBalance(address receiver, uint256 balance);
    event OwnerBalance(address owner, uint256 balance);

    function sendEther(address payable receiver) payable public {
        receiver.transfer(msg.value);
        balance[receiver] += msg.value;
        emit EthSentToContract(receiver, msg.value);
        emit ReceiverBalance(receiver, receiver.balance);
        emit OwnerBalance(msg.sender , msg.sender.balance);
    }
    
}
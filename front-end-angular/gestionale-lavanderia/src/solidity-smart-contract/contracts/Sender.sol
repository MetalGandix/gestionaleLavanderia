// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract Sender {
    mapping (address => uint) balance; //Mappa che contiene gli indirizzi che hanno depositato soldi su questo contratto

    //Get the ether sent to the contract and the address of the receiver
    event EthSentToContract(address receiver, uint amount); 

    //Get the balance of the receiver
    event ReceiverBalance(address receiver, uint256 balance);

    //Get the balance of the owner
    event OwnerBalance(address owner, uint256 balance);

    function sendEther(address payable receiver) payable public {
        receiver.transfer(msg.value);
        balance[receiver] += msg.value;
        emit EthSentToContract(receiver, msg.value);
        emit ReceiverBalance(receiver, receiver.balance);
        emit OwnerBalance(msg.sender , msg.sender.balance);
    }

    // Mapping of delegators to their assigned delegates
    mapping(address => address) public delegations;

    function delegateEther(address payable receiver) payable public {
        // Get the sender of the ether
        address sender = msg.sender;
        // Check if the sender has an assigned delegate
        address delegate = delegations[sender];
        if (delegate != address(0)) {
            // Send the ether to the delegate if one is set
            receiver.transfer(msg.value);
        }
    }

    // Function to set a delegate
    function setDelegate(address delegate) public {
        // Set the delegate for the sender
        delegations[msg.sender] = delegate;
    }
    
}
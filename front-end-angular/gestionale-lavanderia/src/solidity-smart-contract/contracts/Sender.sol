// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract Sender {
    uint public amount;
    function sendEther(address payable owner) payable public {
        owner.transfer(amount);
    }
}
// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Sender {
 uint public amount = 1 ether;

    function send(address payable _addr) payable public {
        require(msg.value >= amount);
        _addr.transfer(msg.value);
    }
}
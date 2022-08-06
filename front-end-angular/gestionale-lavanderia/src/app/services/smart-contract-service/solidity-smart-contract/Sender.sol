// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Sender {
    function send(address payable _addr, uint amount) payable public {
        require(msg.value >= amount);
        _addr.transfer(msg.value);
    }
}
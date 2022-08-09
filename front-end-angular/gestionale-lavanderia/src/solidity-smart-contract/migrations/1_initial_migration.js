const Sender = artifacts.require("Sender");
const Receiver = artifacts.require("Receiver");

module.exports = function (deployer) {
  deployer.deploy(Sender);
  deployer.deploy(Receiver);
};

const Sender = artifacts.require("Sender");

module.exports = function (deployer) {
  deployer.deploy(Sender);
};

export class User {
	id: number;
	username: string;
	password: string;
	lastname: string;
	number: string;
	email: string;
	sesso: string;
	indirizzo: string;
	canReceiveEth: boolean;
	money: number = 0;
	lastPaidEthMonth: number = 0;
	paidMonth: boolean = false;
	cryptoAddress: string
	delegatedAddress: string
}
// Last updated: 11/10/2026, 23:50:26
1/**
2 * @param {string} address
3 * @return {string}
4 */
5var defangIPaddr = function(address) {
6   return  address.replaceAll(".","[.]");
7};
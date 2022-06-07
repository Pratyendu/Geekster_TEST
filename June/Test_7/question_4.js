let n = parseInt(prompt("Enter nth  prime number.:"));
let ctr = 0;
for (let i = 1; i <= 1000; i++) {
  if (checkPrime(i)) {
    ctr++;
    if (ctr === n) {
      console.log(i);
    }
  }
}
function checkPrime(num) {
  //corner case
  //0 and 1 are neither prime nor not prime
  if (num <= 1) {
    return false;
  }

  //checking from 2 to (num - 1)
  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false;
    }
  }

  return true;
}

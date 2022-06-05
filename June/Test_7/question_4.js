let count = 0;
let limit = 5;
let n = 11;
for (count = 1; count <= limit; count++) {
  for (let i = 1; i <= n; i++) {
    if (checkPrime(i)) {
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

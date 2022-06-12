/*In how many ways can we loop in an array describe each with an example.
Sol: */

// 1. For Loop

let array = [1, 2, 3, 4, 5, 6];
for (let i = 0; i < array.length; i++) {
  console.log("method1 using for loop", array[i]);
}
console.log("------------");

// 2. 'for' loop 'of' method

for (let elements of array) {
  console.log("method2 using for of loop", elements);
}
console.log("-----------------");

//3. 'for in' method
let text = "";
for (let component in array) {
  text = text + array[component];
}
console.log('the components of array using "for in" method are:', text);

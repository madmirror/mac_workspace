import iter from 'iterutils';
let { any, all, take, count, list, iterCount} = iter.iterutils
let { range, randrange } = iter.mathutils;
let { GenWrap}  = iter.funcutils;
console.log(iter);


console.log('hello test')

let ten = take(10, count());
console.log([...ten]);

let rand10 = [...range(10)].map(_ => randrange(5, 10));
console.log(rand10)

let any5 = any(rand10.map(x => x == 5))
console.log(any5)

console.log(all(rand10.map(x => x > 5)))



const is_prime = n => all(list(range(2, Math.sqrt(n) + 1)).map(x => n % x != 0));

let pris = [...range(2, 200)].filter(x => is_prime(x))
console.log(pris.join(', '))
console.log(iterCount(pris))

const gen_prime = n => all(GenWrap.of(range(2, Math.sqrt(n) + 1)).map(x => n % x != 0));
let p100 = list(take(100, GenWrap.of(count(2)).filter(x => gen_prime(x))));

console.log(p100.join(', '))

let k1 = list(GenWrap.of(range(2, 1001)).filter(x => gen_prime(x)));
console.log(k1.join(', '))

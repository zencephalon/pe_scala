// println(List.range(1, 1000).foldLeft(0)((total, i) => if(i % 3 == 0) total + i else if (i % 5 == 0) total + i else total))
// Better solution:
println((1 until 1000).filter(i => i % 3 == 0 || i % 5 == 0).foldLeft(0)(_ + _))
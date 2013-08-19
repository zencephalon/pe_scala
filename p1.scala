println(List.range(1, 1000).foldLeft(0)((total, i) => if(i % 3 == 0) total + i else if (i % 5 == 0) total + i else total))

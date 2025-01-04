def someMethod() {
  def x = [1, 2, 3]
  x << 4
  println x //[1,2,3,4] 
  x.clear()
  x.addAll([5,6,7])
  println x //[5,6,7]
}
someMethod() 
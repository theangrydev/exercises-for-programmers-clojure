(ns exercises-for-programmers-clojure.ex01_saying_hello)

(defn greeter []
  (print "What is your name? ")
  (print (format "Hello, %s, nice to meet you!\n" (read-line))))

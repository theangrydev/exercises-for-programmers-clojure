(ns exercises-for-programmers-clojure.ex01_saying_hello)

(defn greeter []
  (console/print "What is your name? ")
  (console/print (format "Hello, %s, nice to meet you!\n" (console/read-line))))

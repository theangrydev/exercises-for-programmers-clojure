(ns exercises-for-programmers-clojure.ex01_saying_hello_test
  (:require
    [exercises-for-programmers-clojure.ex01_saying_hello :refer :all]
    [midje.sweet :refer :all]))

(fact
  "greeting greets the user"
  (greeter) => nil
  (provided
    (console/print "What is your name? ") => nil :times 1
    (console/read-line) => "Liam" :times 1
    (console/print "Hello, Liam, nice to meet you!\n") => nil :times 1))
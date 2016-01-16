(ns exercises-for-programmers-clojure.ex02_counting_the_number_of_characters_test
  (:require
    [exercises-for-programmers-clojure.ex02_counting_the_number_of_characters :refer :all]
    [midje.sweet :refer :all]))

(tabular
  (fact
    "counts the number of characters in the input string"
    (counter) => nil
    (provided
      (print "What is the input string? ") => nil :times 1
      (read-line) => ?input-string :times 1
      (print (format "'%s' has %d characters\n" ?input-string ?expected-count)) => nil :times 1))
  ?input-string ?expected-count
  "Liam" 4
  "Space Input" 11
  "" 0)


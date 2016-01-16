(ns exercises-for-programmers-clojure.ex02_counting_the_number_of_characters)

(defn counter []
  (print "What is the input string? ")
  (def input-string (read-line))
  (print (format "'%s' has %d characters\n" input-string (count input-string))))

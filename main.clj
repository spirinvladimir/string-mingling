(println
  (let [s1 (clojure.string/split (read-line) #"")
        s2 (clojure.string/split (read-line) #"")]
      (loop [p s1
             q s2
             r ""]
        (if (> (count (rest p)) 0)
          (recur
            (rest p)
            (rest q)
            (str r (first p) (first q)))
          (str r (first p) (first q))))))

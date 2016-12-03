(println
  (let [s1 (clojure.string/split (read-line) #"")
        s2 (clojure.string/split (read-line) #"")]
      (loop [p s1
             q s2
             r ""]
        (let [a (first p)
              b (first q)]
            (if (nil? a)
                r
                (recur
                    (rest p)
                    (rest q)
                    (str r a b)))))))

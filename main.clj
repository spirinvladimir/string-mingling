(println
  (loop [p (clojure.string/split (read-line) #"")
         q (clojure.string/split (read-line) #"")
         r []]
      (let [a (first p)
            b (first q)]
          (if (nil? a)
            (reduce str r)
            (recur
              (rest p)
              (rest q)
              (conj r a b))))))

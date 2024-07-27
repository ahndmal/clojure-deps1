(ns com.andmal.multifld-compar)

(def john1 {:name "John", :salary 35000.00, :company "Acme"})
(def mary  {:name "Mary", :salary 35000.00, :company "Mars Inc"})
(def john2 {:name "John", :salary 40000.00, :company "Venus Co"})
(def john3 {:name "John", :salary 30000.00, :company "Asteroids-R-Us"})
(def people [john1 mary john2 john3])

(defn by-salary-name-co [x y]
  ;; :salary values sorted in decreasing order because x and y
  ;; swapped in this compare.
  (let [c (compare (:salary y) (:salary x))]
    (if (not= c 0)
      c
      ;; :name and :company are sorted in increasing order
      (let [c (compare (:name x) (:name y))]
        (if (not= c 0)
          c
          (let [c (compare (:company x) (:company y))]
            c))))))

(ns com.andmal.loops)

(def pets [
    {:name "Fluffykins" :type :cat}
    {:name "Sparky" :type :dog}
    {:name "Tibby" :type :dog}
    {:name "Al" :type :fish}
    {:name "Victor" :type :bear}
])

; loop
(defn loop-dogs [pets]
    (loop [pets pets
           dogs []]
        (if (first pets)
            (recur (rest pets)
                   (if (= :dog (:type (first pets)))
                       (conj dogs (first pets))
                       dogs))
            dogs)))

; filter
(defn filter-dogs [pets]
    (filter #(= :dog (:type %)) pets))            

; even smaller pieces breaking filtering function out into separate var    

(defn dog? [pet] (= :dog (:type pet)))

(defn filter-dogs [pets] (filter dog? pets))

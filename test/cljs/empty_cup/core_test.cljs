(ns empty-cup.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [empty-cup.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))

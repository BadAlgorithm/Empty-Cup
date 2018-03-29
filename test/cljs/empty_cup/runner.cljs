(ns empty-cup.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [empty-cup.core-test]))

(doo-tests 'empty-cup.core-test)

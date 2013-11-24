# [Cadastre](https://en.wikipedia.org/wiki/Cadastre), a Clojure Doc/Metadata Extractor

A Clojure library designed to survey a Clojure codebase and extract
meta information about it (in particular documentation).


## Project Status

This project is supposed to power the new version of clojuredocs.org. It is
young and is very much **work in progress**.

If you are interested in helping, join `#clojure-doc` on `irc.freenode.net`.


## Usage

This project is primarily used for
[lein-clojuredocs](https://github.com/clojuredocs/lein-clojuredocs). If
you want to use it from leiningen:

```clojure
[clojuredocs/extractor "0.2.0-SNAPSHOT"]
```

To use Extractor as a library:

```clojure
(ns foo
  (:require [clojuredocs.extractor.analyzer :refer :all]))

;; generate a map of clojure var metadata
(gen-clojure "/Users/hinmanm/src/clojure")

;; encode the map to json, filename is optional
(gen-clojure-json "/Users/hinmanm/src/clojure" "foo.json.gz")

;; generate a map of your project's var metadata
(gen-project-docs {:name "foo"
                   :group "org.bar"
                   :url "http://example.com"
                   :description "My thing"
                   :scm "http://github.com/foo/bar"
                   :license {:name "Eclipse Public License"
                             :url "http://www.eclipse.org/legal/epl-v10.html"}
                   :version "1.0"})

;; encode the map to json, filename is optional again
(gen-project-docs-json {...} "bar-1.0.json.gz")

;; read metadata from a file
(read-namespace (clojure.java.io/file "/Users/hinmanm/src/clj/cadastre/src/cadastre/analyzer.clj"))

;; serialize a map to a file, filename is optional
(serialize-project-info {...} "myfile.json.gz")

;; You can bind *verbose* to println status:
(binding [*verbose* true]
  (gen-clojure-json "/Users/hinmanm/src/clojure"))
;; [+] Processing clojure.core...
;; [+] Processing clojure.core.protocols...
;; [+] Processing clojure.core.reducers...
;; [+] Processing clojure.data...
;; [+] Processing clojure.inspector...
;; [+] Processing clojure.instant...
;; [+] Processing clojure.java.browse...
;; [+] Processing clojure.java.browse-ui...
;; [+] Processing clojure.java.io...
;; [+] Processing clojure.java.javadoc...
;; [+] Processing clojure.java.shell...
;; [+] Processing clojure.main...
;; [+] Processing clojure.parallel...
;; [+] Processing clojure.pprint...
;; [+] Processing clojure.reflect...
;; [+] Processing clojure.repl...
;; [+] Processing clojure.set...
;; [+] Processing clojure.stacktrace...
;; [+] Processing clojure.string...
;; [+] Processing clojure.template...
;; [+] Processing clojure.test...
;; [+] Processing clojure.test.junit...
;; [+] Processing clojure.test.tap...
;; [+] Processing clojure.uuid...
;; [+] Processing clojure.walk...
;; [+] Processing clojure.xml...
;; [+] Processing clojure.zip...
;; [-] Writing output to clojure-1.5.0-alpha6.json.gz
;; [=] Done generating clojure json.gz file.
```

Example json output can be found [here (for cheshire)](https://gist.github.com/3880616)

## See Also

- [lein-clojuredocs](http://github.com/clojuredocs/lein-clojuredocs)
- [clojuredocs-next (API + website)](http://github.com/clojuredocs/web)

## License

Copyright © 2012-2013 Lee Hinman and contributors

Distributed under the Eclipse Public License, the same as Clojure.

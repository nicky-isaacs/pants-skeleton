Pants Java/Scala Skeleton
==========================

This is a skeleton from which you can build Scala/Java apps. It is setup such
that you can easily choose your version of Scala.


## Changing Scala versions
If you want to make a minor change to the Scala version (i.e. `2.11.X`) then
you simply need to modify the `BUILD.tools` file `scala_version` definition to be
whatever you want. Example:

```
scala_version = '2.11.12' # 12 being the minor version
```

Should you wish to bump the major version (say from `2.11.12` to `2.12.1`) you
will need to:

1. Modify the `pants.ini` file's `suffix_version` definition
2. Update the `scala_version` in the `BUILD.tools` file as above. Example:

```
# In pants.ini
suffix_version: 2.12
```

```
# In BUILD.tools
scala_version = '2.11.12'
```

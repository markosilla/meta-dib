INC_PR = "r0"

# Hardcoded versions since source repo do not use tags.
# Increment first number when SRCREV is updated to newer version.
# PR version can be reset to 0, when that is done.

#PV = 0.001+git${SRCPV}"
#SRCREV = "ffffffffffffffffffffffffffffffffffffffff"
#SRC_URI = "git://repo/emasill/tmp/dib-sw/.git;protocol=git;user=${USER};nobranch=1"

BRANCH = "master"
SRCREV = "c527c585271be593659d334de2e4733c4631d497"
SRC_URI = "git://github.com/markosilla/dib-sw.git;protocol=git;branch=${BRANCH}"
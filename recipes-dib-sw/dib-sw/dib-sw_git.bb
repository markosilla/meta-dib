SUMMARY = "ERICSSON DIBSW Component"
DESCRIPTION = "DIBSW component"
LICENSE = "ERICSSON"

LIC_FILES_CHKSUM = "file://COPYING;md5=ffe150fbf1b043715f7aacf9f0516d1f"

require dib-sw.inc

PR = "${INC_PR}.0"

RDEPENDS_${PN} += "bash"

S = "${WORKDIR}/git/"

EXTRA_OEMAKE = "'CC=${CC}' 'RANLIB=${RANLIB}' 'AR=${AR}' 'CFLAGS=${CFLAGS} -I${S}/include -DWITHOUT_XATTR' 'BUILDDIR=${S}'"

do_install () {
	oe_runmake install DESTDIR=${D} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}
}

BBCLASSEXTEND = "native"
PARALLEL_MAKE = ""

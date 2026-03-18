#!/usr/bin/env sh
##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################
APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`
warn () {
    echo "$*"
}
die () {
    echo
    echo "$*"
    echo
    exit 1
}
# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/bin/java" ] ; then
        JAVACMD="$JAVA_HOME/bin/java"
    else
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME"
    fi
else
    JAVACMD="java"
    which java >/dev/null 2>&1 || die "ERROR: java not found in your PATH."
fi
exec "$JAVACMD" "$@"

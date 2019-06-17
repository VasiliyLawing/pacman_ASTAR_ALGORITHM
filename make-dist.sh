#!/bin/bash

prj_name="prg-b1-examples"

rm -Rf dist
mkdir -p dist/${prj_name}
cp -R src gradle gradlew* build.gradle dist/${prj_name}
cd dist
tar -czf ${prj_name}.tar.gz ${prj_name}
cd ..
rm -Rf dist/${prj_name}

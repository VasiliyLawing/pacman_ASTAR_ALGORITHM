#!/bin/bash

prj_name="prg-b1-course"

rm -Rf dist
mkdir -p dist/${prj_name}
cp -R src gradle gradlew* build.gradle.kts artifactory.properties  dist/${prj_name}
cd dist
zip -r ${prj_name}.zip ${prj_name}
cd ..
rm -Rf dist/${prj_name}

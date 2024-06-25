#!/bin/bash



a=$(git checkout feature/release-notes-hp)

echo "($a)"

#b=$(cat ab.txt)
#echo "($b)"

#c=$(git add rels.sh)
#echo "($c)"

d =$(git commit -m "[feature] my files")
echo "($d)"

e=$(git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[FEATURE\]|)*\[FEATURE\]" |uniq  |awk '{print $1}' |uniq)
echo "($e)" 


git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[FEATURE\]|)*\[FEATURE\]" |uniq  |awk '{print $2 $3 }'

#f =$(git commit -m "[INTERNAL] my file")
#echo "($f)"

git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[INTERNAL\]|)*\[INTERNAL\]" |uniq |awk '{print $1}' |uniq

git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[INTERNAL\]|\[FEATURE\]|\[FIX\]|\[DOC\])*\[INTERNAL\]" |uniq |awk '{print $2 $3}' |uniq


git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[INTERNAL\]|\[FEATURE\]|\[FIX\]|\[DOC\])*\[FIX\]" |uniq |awk '{print $1}' |uniq

git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[INTERNAL\]|\[FEATURE\]|\[FIX\]|\[DOC\])*\[FIX\]" |uniq |awk '{print $2 $3}' |uniq

git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[INTERNAL\]|\[FEATURE\]|\[FIX\]|\[DOC\])*\[DOX\]" |uniq |awk '{print $1}' |uniq

git log --pretty=format:"%s" v1.0.0..HEAD | grep -i -E "^(\[INTERNAL\]|\[FEATURE\]|\[FIX\]|\[DOC\])*\[DOX\]" |uniq |awk '{print $2 $3}' |uniq


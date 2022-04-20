start=`date +%s.%N`
./suboptima_O0
end=`date +%s.%N`

runtime=$( echo "$end - $start" | bc -l )
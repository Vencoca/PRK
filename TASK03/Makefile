def:
	lex WBG.l 
	gcc lex.yy.c -lfl -o lexOut
	mkdir bin || [ -d $(bin) ]
	mv lexOut ./bin
clean:
	rm -rf bin/lexOut
test:
	./bin/lexOut < ./tests/invalid.txt > ./tests/results/lexinvalidOUT.txt
	./bin/lexOut < ./tests/valid.txt > ./tests/results/lexvalidOUT.txt
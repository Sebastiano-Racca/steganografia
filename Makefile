SRC_DIR := src/
BIN_DIR := bin
LIB_DIR := lib

JAVAC := javac
JAVA := java
CP := -cp $(BIN_DIR):$(LIB_DIR)/*

JAVA_FILES := $(wildcard $(SRC_DIR)/*.java)
MAIN_CLASS := Main

SOURCE := gatto.pgm
DESTINATION := gatto2.pgm
MESSAGE := Hello World!

quickrun: build run

build:
	@echo "Compilando..."
	@$(JAVAC) $(CP) -d $(BIN_DIR) $(JAVA_FILES)

run:
	@$(JAVA) $(CP) $(MAIN_CLASS) $(SOURCE) $(DESTINATION) $(MESSAGE)

clean:
	@echo "Rimuovendo i file binari..."
	@rm -rf $(BIN_DIR)

.PHONY: quickrun build run clean

SRC_DIR := src/
BIN_DIR := bin
LIB_DIR := lib

JAVAC := javac
JAVA := java
CP := -cp $(BIN_DIR):$(LIB_DIR)/*

JAVA_FILES := $(wildcard $(SRC_DIR)/*.java)
MAIN_CLASS := Main

quickrun: build run

build:
	@echo "Compilando..."
	@$(JAVAC) $(CP) -d $(BIN_DIR) $(JAVA_FILES)

run:
	@$(JAVA) $(CP) $(MAIN_CLASS) "gatto.pgm" "gatto2.pgm" "ci"

clean:
	@echo "Rimuovendo i file binari..."
	@rm -rf $(BIN_DIR)

.PHONY: quickrun build run clean

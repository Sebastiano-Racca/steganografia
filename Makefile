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
	@echo "Compiling Java source files..."
	@$(JAVAC) $(CP) -d $(BIN_DIR) $(JAVA_FILES)

run:
	@echo "Running the main application..."
	@$(JAVA) $(CP) $(MAIN_CLASS)

clean:
	@echo "Cleaning up..."
	@rm -rf $(BIN_DIR)

.PHONY: quickrun build run clean

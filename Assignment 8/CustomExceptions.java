// EmptyFieldException for empty fields
class EmptyFieldException extends Exception {
    public EmptyFieldException(String message) {
        super(message);
    }
}

// DuplicatePRNException for duplicate PRN numbers
class DuplicatePRNException extends Exception {
    public DuplicatePRNException(String message) {
        super(message);
    }
}

// StudentNotFoundException for student not found
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

// InvalidMarksException for invalid marks
class InvalidMarksException extends Exception {
        public InvalidMarksException(String message) {
            super(message);
    }
}



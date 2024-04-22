import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {

    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size(), null);
    }

    void save(Resume r) {
        storage[size] = r;
        size++;
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)){
                for (int j = 0; j < size; j++) {
                    storage[j] = storage[j+1];
                }
                size--;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        int resumeCount = 0;
        for (int i = 0; i < storage.length && storage[i] != null; i++) {
            resumeCount++;
        }
        return Arrays.copyOfRange(storage, 0, resumeCount);
    }

    int size() {
        return size;
    }
}

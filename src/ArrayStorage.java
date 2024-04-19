import java.util.Arrays;


/**
 * Array based storage for Resumes
 */
public class ArrayStorage {


    Resume[] storage = new Resume[10000];

    void clear() {

        Arrays.fill(storage, null);
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                break;
            }
        }

    }

    Resume get(String uuid) {
        int i = 0;
        while (storage[i] != null) {
            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
            i++;
        }

        return null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        return Arrays.copyOf(storage, storage.length);
    }

    int size() {
        return storage.length;
    }
}

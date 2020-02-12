package com.github.unidbg.ios.struct.kernel;

import com.github.unidbg.file.StatStructure;
import com.github.unidbg.unix.struct.TimeSpec;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public final class Stat extends StatStructure {

    public Stat(Pointer p) {
        super(p);
        unpack();
    }

    public TimeSpec st_atimespec; /* time of last access */
    public TimeSpec st_mtimespec; /* time of last data modification */
    public TimeSpec st_ctimespec; /* time of last status change */
    public TimeSpec st_birthtimespec; /* time of file creation(birth) */

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("st_dev", "st_mode", "st_nlink", "st_ino", "st_uid", "st_gid", "st_rdev",
                "st_atimespec", "st_mtimespec", "st_ctimespec", "st_birthtimespec",
                "st_size", "st_blocks", "st_blksize", "st_flags", "st_gen");
    }

}
String solution(String address) {
        int vi_tri_ten_mien = address.lastIndexOf("@");
        return address.substring(vi_tri_ten_mien + 1);
        }

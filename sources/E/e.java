package E;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f683b;
    public final String c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f684e;

    /* renamed from: f, reason: collision with root package name */
    public final String f685f;

    /* renamed from: g, reason: collision with root package name */
    public final String f686g;

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f682a = str;
        str2.getClass();
        this.f683b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.f684e = str4;
        this.f685f = str5;
        this.f686g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f682a + ", mProviderPackage: " + this.f683b + ", mQuery: " + this.c + ", mSystemFont: " + this.f684e + ", mVariationSettings: " + this.f685f + ", mCertificates:");
        int i4 = 0;
        while (true) {
            List list = this.d;
            if (i4 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i4);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i4++;
        }
    }
}

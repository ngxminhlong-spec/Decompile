package v1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends AbstractC2022a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f15056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15057b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15058e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15059f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15060g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15061h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15062i;

    /* renamed from: j, reason: collision with root package name */
    public final String f15063j;

    /* renamed from: k, reason: collision with root package name */
    public final String f15064k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15065l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f15056a = num;
        this.f15057b = str;
        this.c = str2;
        this.d = str3;
        this.f15058e = str4;
        this.f15059f = str5;
        this.f15060g = str6;
        this.f15061h = str7;
        this.f15062i = str8;
        this.f15063j = str9;
        this.f15064k = str10;
        this.f15065l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2022a) {
            AbstractC2022a abstractC2022a = (AbstractC2022a) obj;
            Integer num = this.f15056a;
            if (num != null ? num.equals(((h) abstractC2022a).f15056a) : ((h) abstractC2022a).f15056a == null) {
                String str = this.f15057b;
                if (str != null ? str.equals(((h) abstractC2022a).f15057b) : ((h) abstractC2022a).f15057b == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(((h) abstractC2022a).c) : ((h) abstractC2022a).c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((h) abstractC2022a).d) : ((h) abstractC2022a).d == null) {
                            String str4 = this.f15058e;
                            if (str4 != null ? str4.equals(((h) abstractC2022a).f15058e) : ((h) abstractC2022a).f15058e == null) {
                                String str5 = this.f15059f;
                                if (str5 != null ? str5.equals(((h) abstractC2022a).f15059f) : ((h) abstractC2022a).f15059f == null) {
                                    String str6 = this.f15060g;
                                    if (str6 != null ? str6.equals(((h) abstractC2022a).f15060g) : ((h) abstractC2022a).f15060g == null) {
                                        String str7 = this.f15061h;
                                        if (str7 != null ? str7.equals(((h) abstractC2022a).f15061h) : ((h) abstractC2022a).f15061h == null) {
                                            String str8 = this.f15062i;
                                            if (str8 != null ? str8.equals(((h) abstractC2022a).f15062i) : ((h) abstractC2022a).f15062i == null) {
                                                String str9 = this.f15063j;
                                                if (str9 != null ? str9.equals(((h) abstractC2022a).f15063j) : ((h) abstractC2022a).f15063j == null) {
                                                    String str10 = this.f15064k;
                                                    if (str10 != null ? str10.equals(((h) abstractC2022a).f15064k) : ((h) abstractC2022a).f15064k == null) {
                                                        String str11 = this.f15065l;
                                                        if (str11 != null ? str11.equals(((h) abstractC2022a).f15065l) : ((h) abstractC2022a).f15065l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f15056a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f15057b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f15058e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f15059f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f15060g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f15061h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f15062i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f15063j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f15064k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f15065l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f15056a);
        sb.append(", model=");
        sb.append(this.f15057b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.f15058e);
        sb.append(", osBuild=");
        sb.append(this.f15059f);
        sb.append(", manufacturer=");
        sb.append(this.f15060g);
        sb.append(", fingerprint=");
        sb.append(this.f15061h);
        sb.append(", locale=");
        sb.append(this.f15062i);
        sb.append(", country=");
        sb.append(this.f15063j);
        sb.append(", mccMnc=");
        sb.append(this.f15064k);
        sb.append(", applicationBuild=");
        return n0.a.j(sb, this.f15065l, "}");
    }
}

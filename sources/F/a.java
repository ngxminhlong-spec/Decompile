package F;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f728e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f729a;

    /* renamed from: b, reason: collision with root package name */
    public final int f730b;
    public int c;
    public char d;

    static {
        for (int i4 = 0; i4 < 1792; i4++) {
            f728e[i4] = Character.getDirectionality(i4);
        }
    }

    public a(CharSequence charSequence) {
        this.f729a = charSequence;
        this.f730b = charSequence.length();
    }

    public final byte a() {
        int i4 = this.c - 1;
        CharSequence charSequence = this.f729a;
        char charAt = charSequence.charAt(i4);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c--;
        char c = this.d;
        return c < 1792 ? f728e[c] : Character.getDirectionality(c);
    }
}

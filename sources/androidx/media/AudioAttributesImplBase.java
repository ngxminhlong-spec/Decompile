package androidx.media;

import U.a;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f2999a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3000b = 0;
    public int c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        int i4;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3000b == audioAttributesImplBase.f3000b) {
            int i5 = this.c;
            int i6 = audioAttributesImplBase.c;
            int i7 = audioAttributesImplBase.d;
            if (i7 == -1) {
                int i8 = audioAttributesImplBase.f2999a;
                int i9 = AudioAttributesCompat.f2995b;
                if ((i6 & 1) != 1) {
                    i4 = 4;
                    if ((i6 & 4) != 4) {
                        switch (i8) {
                            case 2:
                                i4 = 0;
                                break;
                            case 3:
                                i4 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i4 = 5;
                                break;
                            case 6:
                                i4 = 2;
                                break;
                            case 11:
                                i4 = 10;
                                break;
                            case 12:
                            default:
                                i4 = 3;
                                break;
                            case 13:
                                i4 = 1;
                                break;
                        }
                    } else {
                        i4 = 6;
                    }
                } else {
                    i4 = 7;
                }
            } else {
                i4 = i7;
            }
            if (i4 == 6) {
                i6 |= 4;
            } else if (i4 == 7) {
                i6 |= 1;
            }
            if (i5 == (i6 & 273) && this.f2999a == audioAttributesImplBase.f2999a && this.d == i7) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3000b), Integer.valueOf(this.c), Integer.valueOf(this.f2999a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i4 = this.f2999a;
        int i5 = AudioAttributesCompat.f2995b;
        switch (i4) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = a.i("unknown usage ", i4);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f3000b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}

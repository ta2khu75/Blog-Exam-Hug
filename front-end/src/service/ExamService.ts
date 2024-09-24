import instance from "../util/apiInstance";
const basePath = "exam";
export default class ExamService {
    static readPage(page = 1, size = 10): Promise<ApiResponse<PageResponse<ExamResponse>>> {
        return instance.get(basePath, { params: { page, size } });
    }
    static create(data: ExamRequest, image: File): Promise<ApiResponse<ExamResponse>> {
        const form = new FormData();
        form.append("image", image)
        form.append("exam_request", JSON.stringify(data));
        return instance.post(basePath, form);
    }
    static readPageMyExam(page = 1, size = 10): Promise<ApiResponse<PageResponse<ExamResponse>>> {
        return instance.get(`${basePath}/my-exam`, { params: { page, size } });
    }
    static readPageByCategory(categoryId: number, page = 1, size = 10): Promise<ApiResponse<PageResponse<ExamResponse>>> {
        return instance.get(`${basePath}/category/${categoryId}`, { params: { page, size } });
    }
    static readPageByAuthorId(authorId: string, page = 1, size = 10): Promise<ApiResponse<PageResponse<ExamResponse>>> {
        return instance.get(`${basePath}/author/${authorId}`, { params: { page, size } });
    }
    static update(id: string, data: ExamRequest, image?: File): Promise<ApiResponse<ExamResponse>> {
        const form = new FormData();
        if (image) {
            form.append("image", image)
        }
        form.append("exam_request", JSON.stringify(data));
        return instance.put(`${basePath}/${id}`, form);
    }
    static readDetailsById(id: string): Promise<ApiResponse<ExamDetailsResponse>> {
        return instance.get(`${basePath}/${id}/details`);
    }
    static delete(id: string): Promise<ApiResponse<void>> {
        return instance.delete(`${basePath}/${id}`);
    }
    static readById(id: string): Promise<ApiResponse<ExamResponse>> {
        return instance.get(`${basePath}/${id}`);
    }
}